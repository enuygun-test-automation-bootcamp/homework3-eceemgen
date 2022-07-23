//Example 2 for using all the information since the beginning of course.
    enum ETypeId {
        alpha  = "a";
        beta   = "b";
        gamma  = "g";
    }

    interface IType {
        id =  ETypeId;
        title = string;
    }

      const myMap = Map < string, IType > = new Map ([

            [ ETypeId.alpha,  { id: ETypeId.alpha, title: "Alpha" } ],
            [ ETypeId.beta,  { id: ETypeId.beta,  title: "Beta"  } ],
            [ ETypeId.gamma, { id: ETypeId.gamma, title: "Gamma" } ]
            );
            ]

    console.log(myMap.get(ETypeId.alpha)) ;

